package io.github.spair.tauwebmap

import io.vertx.core.AbstractVerticle
import java.io.File

class MapGenerationVerticle : AbstractVerticle() {

    init {
        File(MAPS_FOLDER).mkdir()
    }
}
