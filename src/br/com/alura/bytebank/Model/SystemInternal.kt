package br.com.alura.bytebank.Model

class SystemInternal {

    fun enter (admin: Authentic, password:Int, authenticated: () -> Unit= {}){
        if(admin.authentic(password)){
            println("Welcome in the Bytebank")
            authenticated()
        }else{
            println("Authentication failure")
        }
    }


    fun enterRecever (admin: Authentic, password:Int, authenticated: SystemInternal.() -> Unit= {}){
        if(admin.authentic(password)){
            println("Welcome in the Bytebank")
            authenticated(this)
        }else{
            println("Authentication failure")
        }
    }
}