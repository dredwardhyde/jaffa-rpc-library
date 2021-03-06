package com.jaffa.rpc.lib.serialization

import com.jaffa.rpc.lib.common.OptionConstants

object Serializer {
    var isKryo = true

    lateinit var current: ObjectSerializer

    @kotlin.jvm.JvmStatic
    fun init() {
        isKryo = System.getProperty(OptionConstants.SERIALIZER, "kryo") == "kryo"
        if (isKryo) {
            current = KryoPoolSerializer()
        } else {
            current = JavaSerializer()
        }
    }
}