package com.ysn.shared.models.interactors

import io.reactivex.Observable

interface GetValueInteractor {
    fun receiveValue(): Observable<String>

    fun hasValue(): Boolean
}