package com.costaoeste.learnenglish.injection.components;

import android.app.Application;
import android.content.Context;

import com.costaoeste.learnenglish.LearnEnglishApplication;
import com.costaoeste.learnenglish.data.DataManager;
import com.costaoeste.learnenglish.data.local.VocabularyRepo;
import com.costaoeste.learnenglish.data.remote.DictionaryService;
import com.costaoeste.learnenglish.injection.modules.DataModule;
import com.costaoeste.learnenglish.injection.qualifiers.ApplicationContext;
import com.costaoeste.learnenglish.injection.modules.ApplicationModule;
import com.costaoeste.learnenglish.injection.scopes.PerApplication;

import dagger.Component;
import io.realm.Realm;

@PerApplication
@Component(modules = {ApplicationModule.class,DataModule.class})
public interface ApplicationComponent {

  void inject(LearnEnglishApplication fleapApplication);

  @ApplicationContext Context context();
  Application application();

  DataManager dataManager();
  Realm realm();
  VocabularyRepo vocabularyRepo();
  DictionaryService dictionaryService();

}