package com.ysn.shared.models.services

interface StringService {
    fun hasString(): Boolean
    fun getString(): String
    fun setString(value: String)
}