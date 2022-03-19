# Verfeinerung des Angreifermodells und Fähigkeiten in einer Angriffspfadgenerierung

## Siehe auch
* forked from https://github.com/FluidTrust/Palladio-Addons-ContextConfidentiality-Metamodel
* Analyse: https://github.com/Patrick-Spiesberger/Palladio-Addons-ContextConfidentialityAnalysis_Mitigation
* Testmodelle: https://github.com/Patrick-Spiesberger/Testmodels

Dieses Projekt enthält das Meta-Modell zu der zugehörigen Verfeinerung der oben genannten Analyse.

## Einführung

### Technologien
* Modellierung: 
	* Eclipse Modeling Framework ([EMF](https://www.eclipse.org/modeling/emf/ "EMF"))
* Code
	* Java 11
	* KAMP Framework 

## Installation

### Vorraussetzungen

* Java (getestet mit JDK 11.0.13)
* git (getestet mit Version 2.17.1)

### Schritt 1: Eclipse Modeling Tools
* Eclipse Modeling Tools Version [2021-09] installieren (https://www.eclipse.org/downloads/packages/release/2021-09/r/eclipse-modeling-tools "2021-09")
* Installieren Sie folgende Software über "Hilfe" -> "Neue Software installieren"
   * Palladio [Updatesite](https://updatesite.palladio-simulator.com/palladio-build-updatesite/releases/5.0.0/ "Updatesite")
   * KAMP [Updatesite](https://kamp-research.github.io/KAMP/)

### Schritt 2: Projekt importieren
* Klonen Sie dieses Repository
* In Eclipse:
	* Import -> General -> Existing Projects -> entpackten Ordner auswählen
	* Select All -> Import
	* Project -> Clean
	* Eclipse neustarten
	* Project -> Clean
  
 ## Änderungen
 ### AttackerSpecification
 * Das AssemblyContextDetail enthält nun eine Liste an kompromittierbaren AssemblyContexten. In diesem Modell kann außerdem festgelegt werden, ob für Teilkomponenten einer zusammengesetzen Komponente andere Angriffsvektoren gelten.
 * Der Angreifer hat zusätzliche Fähigkeiten bekommen. Konkret wird modelliert, welchen Aufwand ein Angreifer für die Generierung passender Attribute aufwendet (Achtung: das Ergebnis ist eine Überabschätzung). Außerdem kann festgelegt werden (in Sekunden), nach welcher Zeit ein Angreifer auf eine effizientere Möglichkeit als einen "Brute-Force-Angriff" zurückgreift. 
