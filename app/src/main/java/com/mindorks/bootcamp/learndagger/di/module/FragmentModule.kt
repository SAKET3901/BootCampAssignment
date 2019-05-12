package com.mindorks.bootcamp.learndagger.di.module

import android.content.Context
import androidx.fragment.app.Fragment
import com.mindorks.bootcamp.learndagger.di.qualifier.FragmentContext
import dagger.Module
import dagger.Provides

@Module
class FragmentModule constructor(private val fragment: Fragment){
    @FragmentContext
    @Provides
    fun provideContext():Context?=fragment.context
}