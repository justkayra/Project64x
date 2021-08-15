package com.semantyca.service;

import com.semantyca.dto.Home;
import com.semantyca.dto.IPage;
import com.semantyca.localization.LanguageCode;

import javax.annotation.PostConstruct;
import java.util.HashMap;
import java.util.Map;

public class LocalizationService {
    Map<String, IPage> pageTypes = new HashMap();

    @PostConstruct
    public void init() {
        Home eng = new Home();
        eng.setName("Semantyca");
        eng.setLang(LanguageCode.ENG);
        eng.setMotto("Semantyca of your business");
        eng.setSubMotto("This is an inception. All you get is this web site");
        eng.setMenuHome("Home");
        eng.setMenuTasks("Tasks");
        pageTypes.put("home", eng);
    }

    public IPage getLocalizedPage(String pageType, String lang) {
        Home eng = new Home();
        eng.setName("Semantyca");
        eng.setLang(LanguageCode.ENG);
        eng.setMotto("Semantyca of your business");
        eng.setSubMotto("This is an inception. All you get is this web site");
        eng.setMenuHome("Home");
        eng.setMenuTasks("Tasks");
        pageTypes.put("home", eng);
         return pageTypes.get(pageType);
    }



}
