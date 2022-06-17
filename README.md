# Architecture-Template
## Overview
<img width="984" alt="android clean architecture by olivia" src="https://user-images.githubusercontent.com/59822833/151776811-81232866-1f45-4bc0-99ed-22a90d24ea74.png">
Android Clean Architecture template  

  - min sdk 21 
  - Android Clean Architecture - Presentation, Domain, Data layer
  - MVVM 

## Description

- [Foundation](https://developer.android.com/jetpack/components) 

  - [AppCompat](https://developer.android.com/topic/libraries/support-library/packages#v7-appcompat) - Degrade gracefully on older versions of Android.
  - [Android KTX](https://developer.android.com/kotlin/ktx) - Write more concise, idiomatic Kotlin code.
  - [Test](https://developer.android.com/training/testing/) - An Android testing framework for unit and runtime UI tests.

- [Architecture](https://developer.android.com/jetpack/arch/)

  - [Data Binding](https://developer.android.com/topic/libraries/data-binding/) - Declaratively bind observable data to UI elements.
  - [Lifecycles](https://developer.android.com/topic/libraries/architecture/lifecycle) - Create a UI that automatically responds to lifecycle events.
  - [LiveData](https://developer.android.com/topic/libraries/architecture/livedata) - Build data objects that notify views when the underlying database changes.
  - [Navigation](https://developer.android.com/topic/libraries/architecture/navigation/) - Handle everything needed for in-app navigation.
  - [Room](https://developer.android.com/topic/libraries/architecture/room) - Access your app's SQLite database with in-app objects and compile-time checks.
  - [paging](https://developer.android.com/jetpack/androidx/releases/paging?hl=ko) 
  - [ViewModel](https://developer.android.com/topic/libraries/architecture/viewmodel) - Store UI-related data that isn't destroyed on app rotations. Easily schedule asynchronous tasks for optimal execution.

- UI 

  - [Compose](https://developer.android.com/jetpack/compose) declarative UI framework
  - XML

- Third party and miscellaneous libraries

  - [Coil](https://coil-kt.github.io/coil/compose/) image loader
  - [Glide](https://bumptech.github.io/glide/) for image loading
  - [Hilt](https://developer.android.com/training/dependency-injection/hilt-android): for [dependency injection](https://developer.android.com/training/dependency-injection)
  - [Kotlin Coroutines](https://kotlinlang.org/docs/reference/coroutines-overview.html) for managing background threads with simplified code and reducing needs for callbacks
  - [retrofit2](https://square.github.io/retrofit/) 
