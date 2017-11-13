[![MIT License][license-badge]][LICENSE]

# scala-play-angular-seed

> scala-play-angular-seed project illustrates how Play Framework can be used to develop backend/services along with Angular to develop the front-end/ui.

## Used Versions

* [Play Framework: 2.6.7](https://www.playframework.com/documentation/2.6.x/Home)
* [Angular: 5.0.0](https://angular.io/)
* [Angular CLI: 1.5.0](https://cli.angular.io/)

## How to use it? 

### Prerequisites

* This assumes that you have [npm](https://npmjs.org/) installed.

### Let's get started,

* Clone the application and open application as a sbt project.

* This application is not using any of the java play views and all the views are served by the [Angular](https://angular.io/) code base which is inside the `ui` folder.

* Used any of the sbt commands listed in the below according to the requirement which are working fine with this application.(To see more details of [sbt](http://www.scala-sbt.org/))

``` 
    sbt clean           # Clear existing build files
    
    sbt stage           # Build your application from your project’s source directory
    
    sbt run             # Run both backend and frontend builds in watch mode
    
    sbt dist            # Build both backend and frontend sources into a single distribution
    
    sbt test            # Run both backend and frontend unit tests 
```  
## Routes

```
├── /conf/      
│     ├── routes 
```

* The following route configuration allows to map front end index.html to index route. This should be placed as the first route in this file.

```
GET        /             controllers.Assets.at(path="/public/ui", file="index.html")
```

**Note: _On production build all the front end Angular build artifacts will be copied to the `public/ui` folder._**

## Contributors

<!-- ALL-CONTRIBUTORS-LIST:START - Do not remove or modify this section -->
|[<img src="https://avatars2.githubusercontent.com/u/5279079?s=400&v=4" width="100px;"/><br /><sub>Yohan Gomez</sub>][yohan-profile]| [<img src="https://avatars2.githubusercontent.com/u/6312524?s=400&u=efc9267c6f903c379fafaaf7b3b0d9a939474c01&v=4" width="100px;"/><br /><sub>Lahiru Jayamanna</sub>][lahiru-profile]<br />| [<img src="https://avatars0.githubusercontent.com/u/3881403?s=400&v=4" width="100px;"/><br /><sub>Gayan Attygalla</sub>](https://github.com/Arty26)| [<img src="https://avatars0.githubusercontent.com/u/24251976?s=400&v=4" width="100px;"/><br /><sub>Anuradha Gunasekara</sub>][anuradha-profile]|
| :---: | :---: | :---: | :---: |
<!-- ALL-CONTRIBUTORS-LIST:END -->

## License

This software is licensed under the MIT license

[license-badge]: http://img.shields.io/badge/license-MIT-blue.svg?style=flat
[license]: https://github.com/yohangz/scala-play-angular-seed/blob/master/LICENSE

[yohan-profile]: https://github.com/yohangz
[lahiru-profile]: https://github.com/lahiruz
[gayan-profile]: https://github.com/Arty26
[anuradha-profile]: https://github.com/sanuradhag