# CursedFabricScala

<p align="center">
  <img src="https://github.com/ChessChicken-KZ/CursedFabricScala/raw/master/src/main/resources/assets/cursedfabricscala/icon.png" />
</p>

[![](https://jitpack.io/v/ChessChicken-KZ/CursedFabricScala.svg)](https://jitpack.io/#ChessChicken-KZ/CursedFabricScala)


**CursedFabricScala** - a small mod adapter for [`babric`](https://babric.github.io/) allowing coding and running mods written on scala.
## Usage for Modders
This mod uses [jitpack.io](https://jitpack.io/) for building and distributing jars. For newer or older versions, [consider checking this page](https://jitpack.io/#ChessChicken-KZ/CursedFabricScala/).
```groovy
repositories {
    maven {
        url 'https://jitpack.io'
    }
}
```

```groovy
dependencies {
    modImplementation "com.github.ChessChicken-KZ:CursedFabricScala:0.2-3.1.3"
}
```

After implementing, change your entrypoint in the `fabric.mod.json`.
```json
"entrypoints": {
  "main":
  [
    {
      "adapter": "scala",
      "value": "stuff.ScalaClazz"
    }
  ]
}
```

## Setup and Building
For setup instructions, please refer to [stationapi-example-mod](https://github.com/calmilamsy/stationapi-example-mod/tree/dev/12).

## License
The project is under [Apache License 2.0](https://raw.githubusercontent.com/ChessChicken-KZ/CursedFabricScala/local/LICENSE_CFS). Feel free to read the document.
```
Copyright 2022 ChessChicken-KZ

Licensed under the Apache License, Version 2.0 (the "License");
you may not use this file except in compliance with the License.
You may obtain a copy of the License at

    http://www.apache.org/licenses/LICENSE-2.0

Unless required by applicable law or agreed to in writing, software
distributed under the License is distributed on an "AS IS" BASIS,
WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
See the License for the specific language governing permissions and
limitations under the License.
```
