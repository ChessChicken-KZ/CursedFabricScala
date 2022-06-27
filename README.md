# CursedFabricScala

CursedFabricScala - is small mod adapter for cursed-fabric-loader allowing coding and running mods written on scala.
## Usage for Modders
Firstly, add this mod as dependency and make sure to have scala sdk.

You can choose two ways to implement this library into your project.

1. This mod uses [jitpack.io](https://jitpack.io/) for building and distributing jars. For newer or old versions, [look here](https://jitpack.io/#ChessChicken-KZ/CursedFabricScala/).
```groovy
repositories {
    maven {
        url 'https://jitpack.io'
    }
}
```

```groovy
dependencies {
    modImplementation "com.github.ChessChicken-KZ:CursedFabricScala:f6dd9f0fb9"
}
```

2. Otherwise, you can just download and `modImplementation` jar file (-dev) from published `Releases`

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
