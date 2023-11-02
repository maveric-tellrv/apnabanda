package com.apnabanda.login

class LoginVerification<string> {
    fun verify(phone:string): Boolean{
        val regex = Regex("^[0-9]{10}$") // 10-digit number
        return regex.matches(phone.toString())

    }
}