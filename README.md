# CountryFlag
[![](https://jitpack.io/v/muyishuangfeng/CountryFlag.svg)](https://jitpack.io/#muyishuangfeng/CountryFlag)

+ 1、在项目的build.gradle下添加

  maven { url 'https://jitpack.io' }
  
![4](https://upload-images.jianshu.io/upload_images/1716569-84f44d0667d0283a.png?imageMogr2/auto-orient/strip%7CimageView2/2/w/1240)



  + 2、在所使用的moule的 app.build中添加项目引用

         implementation 'com.github.muyishuangfeng:CountryFlag:1.0.1'
         
         
   + 3、使用方式
     1、参数说明
     
     |参数|类型|是否必须|说明|
     |:------:|:------:|:-----:|:------|
     |context| Context|是|上下文|
     |mImgFlag|AppcompatImageView|是|imageview控件|
     
     2、调用方式（两个参数的）
     
     CountryUtil.getCountry(context,mImgFlag);
 
     
     |参数|类型|是否必须|说明|
     |:------:|:------:|:-----:|:------|
     |context| Context|是|上下文|
     |countryCode|String|是|国家码（或者国家缩写）|
     |mImgFlag|AppcompatImageView|是|imageview控件|
     
     2、调用方式（两个参数的）
     
     CountryUtil.getCountry(context,country,mImgFlag);
