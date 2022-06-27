# CursedFabricScala

<p align="center">
  <img src="https://github.com/ChessChicken-KZ/CursedFabricScala/raw/master/src/main/resources/assets/cursedfabricscala/icon.png" />
</p>

[![](https://jitpack.io/v/ChessChicken-KZ/CursedFabricScala.svg)](https://jitpack.io/#ChessChicken-KZ/CursedFabricScala)


**CursedFabricScala** - a small mod adapter for `babric` allowing coding and running mods written on scala.
## Usage for Modders
Firstly, add this mod as dependency and make sure to have scala sdk.

1. This mod uses [jitpack.io](https://jitpack.io/) for building and distributing jars. For newer or older versions, [consider checking this page](https://jitpack.io/#ChessChicken-KZ/CursedFabricScala/).
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
