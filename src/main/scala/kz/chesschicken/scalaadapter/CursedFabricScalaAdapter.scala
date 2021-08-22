package kz.chesschicken.scalaadapter

import net.fabricmc.loader.api.{LanguageAdapter, ModContainer}

class CursedFabricScalaAdapter extends LanguageAdapter {

  override def create[T](mod: ModContainer, value: String, clazz: Class[T]): T = {
    try {
      val instance = Class.forName(value + "$").getField("MODULE$").get(null).asInstanceOf[T]

      if(instance != null)
        return instance
      else
        throw new IllegalArgumentException("Not found.")
    } catch {
      case exception: Exception => {
        println(s"Could not find ${clazz.getName}$$MODULE$$")
        return clazz.newInstance()
      }

    }
  }
}
