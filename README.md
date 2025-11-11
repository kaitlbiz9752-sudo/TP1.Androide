
## 📱 Application Android — Toast et Compteur

Cette application Android simple permet à l’utilisateur :

D’afficher un message Toast lorsqu’il clique sur un bouton.

D’incrémenter un compteur affiché à l’écran avec un autre bouton.

## 🧩 Objectif du projet

Créer une interface Android comportant :

Deux champs texte pour le Nom et le Prénom.

Un menu déroulant pour la Ville.

Deux boutons radio pour le Genre (F / M).

Un bouton pour valider.

Un autre bouton pour afficher un message Toast.

Un bouton pour incrémenter un compteur.

## ⚙️ Étapes de développement
**1️⃣ Création du projet**

Ouvrir Android Studio.

Créer un nouveau projet avec le modèle Empty Activity.

Donner un nom au projet, par exemple : ToastCounterApp.

Choisir le langage (Java ou Kotlin).

Valider la création du projet.

**2️⃣ Création de l’interface graphique (fichier XML)**

Ouvrir le fichier de mise en page principal (activity_main.xml).

Ajouter les éléments suivants :

Deux champs de saisie (Nom et Prénom).

Un menu déroulant (Spinner) contenant une liste de villes.

Un groupe de boutons radio pour le genre.

Deux boutons : un pour afficher un message Toast et un autre pour incrémenter le compteur.

Un texte pour afficher la valeur du compteur.

**3️⃣ Programmation de la logique (MainActivity)**

Dans la classe principale, lier les éléments de l’interface (EditText, Spinner, RadioGroup, Boutons, TextView).

Créer une liste de villes et l’associer au menu déroulant.

Pour le bouton “Afficher Toast” :

Récupérer les informations saisies (nom, prénom, ville).

Afficher un message combinant ces informations sous forme de Toast.

Pour le bouton “Incrémenter Compteur” :

Déclarer une variable compteur initialisée à 0.

À chaque clic, augmenter sa valeur et actualiser le texte affiché à l’écran.

**4️⃣ Exécution et test**

Lancer le projet à l’aide de Run ▶️ dans Android Studio.

Choisir un émulateur ou un appareil Android connecté.

Tester :


https://github.com/user-attachments/assets/eab6550e-1e64-48e9-b613-504a9a8694da


Le bouton “Afficher Toast” : un message temporaire apparaît à l’écran.

Le bouton “Incrémenter Compteur” : la valeur augmente à chaque appui.






**5️⃣ Résultat attendu**

L’application affiche une interface similaire à celle de l’image :

Les champs “Nom”, “Prénom”, “Ville” et “Genre”.

Un bouton pour afficher un message.

Un compteur dont la valeur augmente à chaque clic.

## ✅ Améliorations possibles

Ajouter un bouton pour réinitialiser le compteur.

Conserver la valeur du compteur même après rotation de l’écran.

Personnaliser le Toast (couleur, position, durée).
