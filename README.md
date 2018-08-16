# MultApp
productFlavors 用法

```
    // gradle 3.0 版本以上需要
    flavorDimensions "default"
    productFlavors {
        offical {
            dimension "default"
            applicationId "com.felix.multapp"
            buildConfigField "String", "UMENG_KEY", "\"umengkey_0\""
            manifestPlaceholders = [
                    package            : "com.felix.multapp",
                    UMENG_CHANNEL_VALUE: "offical"
            ]
            versionName "1.0.0"
            versionCode 1
        }

        googleplay {
            dimension "default"
            applicationId "com.felix.multapp.googleplay"
            buildConfigField "String", "UMENG_KEY", "\"umengkey_1\""
            manifestPlaceholders = [
                    package            : "com.felix.multapp.googleplay",
                    UMENG_CHANNEL_VALUE: "googleplay"
            ]
            versionName "2.0.0"
            versionCode 2
        }
    }

    sourceSets {

        offical {
            java.srcDirs = ['src/main/java']
            res.srcDirs = ['src/main/res']
            jniLibs.srcDirs = ['src/jniLibs']
        }

        googleplay {
            java.srcDirs = ['src/googleplay/java']
            res.srcDirs = ['src/googleplay/res']
            jniLibs.srcDirs = ['src/jniLibs']
        }

    }
```

参考：
 > https://www.jianshu.com/p/533240d222d3
