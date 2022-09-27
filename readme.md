# TD Abstract Factory

## Exercice 2

Question 1 :

![Diagramme de classes](https://github.com/malo2b/M1_TD_Patterns_FactoryMethod_Ex2/blob/master/DiagrammeDeClasses.png?raw=true)

Question 2 :

C.F Code

Question 3 :

![Diagramme de séquence simulateur humain](https://github.com/malo2b/M1_TD_Patterns_FactoryMethod_Ex2/blob/master/DiagrammeSequenceSimulateurHumain.png?raw=true)

- [1](https://github.com/malo2b/M1_TD_Patterns_FactoryMethod_Ex2/blob/f71aa0b7718f216c42ce6375eb611f32d141d8b1/main.java#L4) Instanciation d'une classe dérivée de Personnage
- [2](https://github.com/malo2b/M1_TD_Patterns_FactoryMethod_Ex2/blob/f71aa0b7718f216c42ce6375eb611f32d141d8b1/Personnage.java#L13) Creation d'une arme à partir du type d'équipement qu'il doit avoir
- [3](https://github.com/malo2b/M1_TD_Patterns_FactoryMethod_Ex2/blob/f71aa0b7718f216c42ce6375eb611f32d141d8b1/FabriqueEquipementLuxe.java#L4) Instanciation de l'arme à partir de la classe FabriqueEquipement correspondante
- [4](https://github.com/malo2b/M1_TD_Patterns_FactoryMethod_Ex2/blob/f71aa0b7718f216c42ce6375eb611f32d141d8b1/Personnage.java#L14) Creation d'un costume à partir du type d'équipement qu'il doit avoir
- [5](https://github.com/malo2b/M1_TD_Patterns_FactoryMethod_Ex2/blob/f71aa0b7718f216c42ce6375eb611f32d141d8b1/FabriqueEquipementLuxe.java#L9) Instanciation de l'arme à partir de la classe FabriqueEquipement correspondante
- [6](https://github.com/malo2b/M1_TD_Patterns_FactoryMethod_Ex2/blob/f71aa0b7718f216c42ce6375eb611f32d141d8b1/Personnage.java#L15) Creation d'un sac à partir du type d'équipement qu'il doit avoir
- [7](https://github.com/malo2b/M1_TD_Patterns_FactoryMethod_Ex2/blob/f71aa0b7718f216c42ce6375eb611f32d141d8b1/FabriqueEquipementLuxe.java#L14) Instanciation de l'arme à partir de la classe FabriqueEquipement correspondante
- [8](https://github.com/malo2b/M1_TD_Patterns_FactoryMethod_Ex2/blob/f71aa0b7718f216c42ce6375eb611f32d141d8b1/main.java#L6) Lancement de la simulation
- [9](https://github.com/malo2b/M1_TD_Patterns_FactoryMethod_Ex2/blob/f71aa0b7718f216c42ce6375eb611f32d141d8b1/Humain.java#L8) Appel de la fonction Animer de l'instance de la classe dérivée de la classe Personnage (longue phrase)
