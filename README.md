# TextJiange</br>
让Textview的文字一个一个显示出来，效果图：</br>
![效果图](https://github.com/385841539/TextJiange/blob/master/app/src/main/res/drawable/jiange.gif)

</br>

# How to use?/如何使用？(或者直接添加JiangeUtil类就可以了)</br>
### 1:添加依赖：

>> 1.先在 build.gradle(Project:XXXX) 的 repositories 添加:</br>
```
	allprojects {
		repositories {
			...
			maven { url 'https://jitpack.io' }
		}
	}
```

>> 2.然后在 build.gradle(Module:app) 的 dependencies 添加:</br>
 
 ```
 dependencies {
	        compile 'com.github.385841539:TextJiange:-SNAPSHOT'
	}
```


### 2:布局文件：(主要就是TextView)

```
<RelativeLayout xmlns:android="http://schemas.android.com/apk/res/android"
    xmlns:tools="http://schemas.android.com/tools"
    android:id="@+id/activity_main"
    android:layout_width="match_parent"
    android:layout_height="match_parent"
    android:paddingBottom="@dimen/activity_vertical_margin"
    android:paddingLeft="@dimen/activity_horizontal_margin"
    android:paddingRight="@dimen/activity_horizontal_margin"
    android:paddingTop="@dimen/activity_vertical_margin"
    tools:context="com.example.ruedy.textjiange.MainActivity">

    <TextView
        android:id="@+id/tv"
        android:layout_width="match_parent"
        android:layout_height="wrap_content" />

    <Button
        android:id="@+id/bt"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:layout_centerInParent="true"
        android:text="again" />
</RelativeLayout>

```


### 3:设置间隔文本:

```
  s = "与我为敌，就到这般生不如死--周瑜\n从善从良，从五斗米道--张鲁";
        jiangeUtil = new JiangeUtil(tv, s, 100);//调用构造方法，直接开启
```

</br>这样 就简单的实现了需求和效果，
具体实现思路请看博客http://blog.csdn.net/iamdingruihaha/article/details/60762502，有问题欢迎反馈，大家一起进步。
