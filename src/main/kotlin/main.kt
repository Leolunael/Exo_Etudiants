package model

import model.Etudiants

fun main() {
    var etudiants = Etudiants("Gaspard", 20)

    println(etudiants.nom)
    etudiants.nom = "Oscar" 
    println(etudiants.nom)

    println(etudiants.age)

    etudiants.inscrire()
    etudiants.inscrire()
    println(etudiants)

    var etudiants2 = Etudiants("Lucie")
    println(etudiants2)

    Etudiants.afficherCompteur()
}