package com.mahammadyagubbayli.qualifier3;

public interface BossInterface {

    // @Alternative: aynı anda sadece 1 tane proje çalışıyor diğerleri kapalı
    // @Qualifier: aynı anda birden fazla proje aktif ancak default olarak çalışacak projeyi seçebiliyoruz

    public String version(String data);
}
