package com.example.dictionaryapp.domain.model

import com.example.dictionaryapp.data.remote.dto.DefinitionDto

data class Meaning(
    val definitions: List<Definition>,
    val partOfSpeech: String
)
