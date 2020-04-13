# Adding to your project
Add the following configuration in your build.gradle file.

	allprojects {
		repositories {
			...
			maven { url 'https://jitpack.io' }
		}
	}

	dependencies {
	        implementation 'com.github.ahmedwasfe:RecyclerAdapter:1.0'
	}
   
