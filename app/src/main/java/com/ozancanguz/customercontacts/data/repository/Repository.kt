package com.ozancanguz.customercontacts.data.repository

import com.ozancanguz.customercontacts.data.localdatasource.LocalDataSource
import dagger.hilt.android.scopes.ViewModelScoped
import javax.inject.Inject

@ViewModelScoped
class Repository@Inject constructor( localDataSource: LocalDataSource) {

    val local=localDataSource
}