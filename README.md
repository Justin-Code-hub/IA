# IA51

# Stable version

## Implemented :
- Human agent
	- Random behaviour
	- Fleeig (from zombie) behaviour
	- Seeking (weapon) behaviour
	- Seeking (zombie) behaviour
- Zombie agent
	- Random behaviour
	- Seeking (human) behaviour
- Environment 
- Basic graphical interface

## Implemented but not used :
- Wall

## To improve :
- GUI
- How to know if the GUI is closed ? At the moment, the test agent never stop
- FOV seems a bit off sometimes
- Conflict resolution

## Todo :
- A wandering behaviour less random / more natural for Zombies and Humans
- Create glass

## Bug  :
- When two zombies are at the same distance from an human and want to go to the human position they will collide and there will never be a solution at the moment
- Infinite loop when trying to resolve conflict (very rare)

## How to launch the simulation :
Click on test.sarl -> run as -> sarl agent
