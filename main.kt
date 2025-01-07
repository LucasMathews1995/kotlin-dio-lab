

enum class Nivel { BASICO, INTERMEDIARIO, DIFICIL }

class Usuario(val nome:String)

data class ConteudoEducacional(var nome: String, val duracao: Int = 60)

data class Formacao(val nome: String, var conteudos: List<ConteudoEducacional>,nivel:Nivel) {

    val inscritos = mutableListOf<Usuario>()
    
    fun matricular(usuario: Usuario) {
        inscritos.add(usuario)
        
            println("${usuario.nome} foi matriculado na formação: $nome")
        
      
    }
}

fun main() {
   val conteudoEdu1:ConteudoEducacional = (ConteudoEducacional("android studio kotlin intermediario"))
   val conteudoEdu2:ConteudoEducacional = (ConteudoEducacional("android studio java completo"))
   val conteudoEdu3:ConteudoEducacional = (ConteudoEducacional("java basico"))
   val conteudoEdu4:ConteudoEducacional = (ConteudoEducacional("kotlin intermediario"))
  

   val formacao:Formacao = (Formacao("dev mobile",listOf(conteudoEdu1,conteudoEdu2),Nivel.DIFICIL))
   val formacao2:Formacao = (Formacao("dev back-end",listOf(conteudoEdu3,conteudoEdu4),Nivel.DIFICIL))
    val formacao3 = Formacao("dev back-end intermediario", listOf(conteudoEdu3),Nivel.INTERMEDIARIO)
    val formacao4 = Formacao("dev back-end basico", listOf(conteudoEdu4),Nivel.BASICO)
   val usuario:Usuario = (Usuario("lucas"))
   val usuario2:Usuario = (Usuario("fernanda"))
   val usuario3:Usuario = (Usuario("Jose"))
    formacao3.matricular(usuario)
    formacao4.matricular(usuario2)
    formacao2.matricular(usuario3)
    val usuario4:Usuario = (Usuario("joao"))
    val usuario5:Usuario = (Usuario("fillipy"))
    formacao.matricular(usuario4)
    formacao2.matricular(usuario5)
    

    





}

