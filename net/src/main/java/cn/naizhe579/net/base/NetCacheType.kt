package cn.naizhe579.net.base

sealed class NetCacheType

object NoCache : NetCacheType()
object OnlyCache : NetCacheType()
object FirstCache : NetCacheType()
