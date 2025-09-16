package model

class Etudiants(var nom: String, var age: Int) {

    var nom: String = nom
        get() = field.uppercase()
        set(value) {
            field = "'$value'"
        }

    private var estInscrit: Boolean = false
    init{
        this.nom = nom
        this.age = age
        nbEtudiant++
        println("Nouvel Etudiant saisi")
    }

    companion object{
        var nbEtudiant: Int = 0
            private set

        fun afficherCompteur(){
            println("Nombre d'étudiant: $nbEtudiant")
        }
    }


    fun inscrire(){
        if(estInscrit)
            println("L'étudiant est déjà inscrit")
        else{
            estInscrit = true
            println("Etudiant inscrit")
        }
    }

}