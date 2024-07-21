package com.arcadone.multiselectiongesture.model

import java.util.UUID

data class ImageModel(val id: Int = UUID.randomUUID().hashCode(), val image: String)