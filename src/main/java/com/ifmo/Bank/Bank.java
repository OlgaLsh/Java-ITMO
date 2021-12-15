package com.ifmo.Bank;

/*
Написать приложение Bank, методы которого вызываются в многопоточной среде.
Это значит, что любой метод может быть вызван одновременно из сотни потоков.

Наиболее важная реализация - метод transferMoney()
Он должен атомарно перевести деньги с одного счёта на другой.
Это значит, что во время перевода никакой другой поток не может ни увидеть
промежуточное состояние счетов, ни выполнять над ними операции.

Ещё все операции должны выполняться по возможности параллельно.

*/


import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

public class Bank extends Thread {
    private ConcurrentMap<long, Account> accMap = new ConcurrentHashMap<>();
    long srcAccId;
    long dstAccId;
    double amount;
    long accId;
    long userId;


    public Account createAccount(long userId) {
        Account acc1 = new Account(userId);
        accMap.put(acc1.getId(), acc1);
        return acc1;

    }

    public double getAmount(long accId) {
        return accMap.get(accId).getAmount();
    }

    public void blockAmount(long accId) {
        accMap.get(accId).setBlocked(true);
    }

    public boolean isAccountBlocked(long accId) {
        return accMap.get(accId).isBlocked();
    }

    public void changeAmount(long accId, double amount) {
        if (isAccountBlocked(accId)){
            throw new RuntimeException("Account is blocked");
        }
        Account account = accMap.get(accId);
        account.setAmount(account.getAmount() + amount);
        notify();

    }

    public static void transferMoney(long srcAccId, long dstAccId, double amount) {
        if (isAccountBlocked(srcAccId) || isAccountBlocked(dstAccId)) {
            throw new RuntimeException("Account is blocked");
        } else {
            if (getAmount(srcAccId) < amount) {
                throw new RuntimeException("Amount is bigger than you have");
            }
        }

        final Object mon1 = new Object();
        final Object mon2 = new Object();
        Thread T1 = new Thread() {
            @Override
            public void run() {
                synchronized (mon1) {
                    changeAmount(srcAccId, -amount);
                }
            }
        };
        Thread T2 = new Thread() {
            @Override
            public void run() {
                synchronized (mon2) {
                    changeAmount(dstAccId, amount);
                }
            }
        };
        T1.start();
        T2.start();

    }



}
