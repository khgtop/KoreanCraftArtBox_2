package com.example.koreancraftartbox2

import android.content.Context
import com.google.android.exoplayer2.mediacodec.MediaCodecInfo
import com.google.android.exoplayer2.mediacodec.MediaCodecSelector
import com.google.android.exoplayer2.video.MediaCodecVideoRenderer


class CustomMediaCodecVideoRenderer(context: Context?, mediaCodecSelector: MediaCodecSelector?) :
    MediaCodecVideoRenderer(context!!, mediaCodecSelector!!) {
    protected fun shouldUseAsynchronouslyConfiguredCodec(codecInfo: MediaCodecInfo?): Boolean {
        return true
    }
}
