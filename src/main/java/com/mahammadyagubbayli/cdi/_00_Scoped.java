package com.mahammadyagubbayli.cdi;

import javax.enterprise.context.*;
import javax.inject.Named;

// kapsam
// yaşam süresi
// performansımızı + -
@Named
// @ApplicationScoped // bütün uygulama boyunca çalışıyor. bütün kullanıcılar için
// @RequestScoped // 1 istek boyunca yaşar.
// @SessionScoped // 1 kullanıcı için yaşar ancak logout
// @Dependent // bukelemon
// @ConversationScoped // belli istek boyunca yaşar
public class _00_Scoped {
}