package com.github.lukaspili.reactivebilling.observable;

import android.content.Context;

import com.github.lukaspili.reactivebilling.BillingService;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;

import rx.Observer;
import rx.Subscriber;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * @author Daniel Hartwich
 */
public class BaseObservableTest {
    @Mock
    Context context;
    private BaseObservable baseObservable;
    Subscriber subscriber;
    @Before
    public void setUp() throws Exception {
        subscriber = new Subscriber() {
            @Override
            public void onCompleted() {

            }

            @Override
            public void onError(Throwable e) {

            }

            @Override
            public void onNext(Object o) {

            }
        };
            baseObservable = new BaseObservable(context) {
                @Override
                protected void onBillingServiceReady(BillingService billingService, Observer observer) {

                }

                @Override
                public void call(Object o) {

                }
            };
    }

    @After
    public void tearDown() throws Exception {

    }

    @Test
    public void constructor() throws Exception {
        assertThat(baseObservable).isNotNull();

    }

    @Test
    public void call() throws Exception {
        baseObservable.call(subscriber);
    }

    @Test
    public void onBillingServiceReady() throws Exception {

    }

}