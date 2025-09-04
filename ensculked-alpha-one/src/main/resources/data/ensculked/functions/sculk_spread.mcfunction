#Made by rennen_rig from the stardust labs discord, code from sculk expansion (https://modrinth.com/datapack/sculk-expansion)
place feature ensculked:sculk_patch_infected
playsound minecraft:block.sculk.charge hostile @a ~ ~ ~

#Extra for the origin
team join ensculked.ensculked @s
power grant @e[type=!player,distance=..6,team=!ensculked.ensculked] ensculked:infected/infected_buildup