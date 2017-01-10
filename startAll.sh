#! /bin/sh
gnome-terminal -e "java -jar EurekaServer/target/EurekaServer-0.1-SNAPSHOT.jar" --title="Eureka"
sleep 10
gnome-terminal -e "java -jar ConfigurationServer/target/ConfigurationServer-0.1-SNAPSHOT.jar" --title="Config"
sleep 10
gnome-terminal -e "java -jar ServerTime/target/ServerTime-0.1-SNAPSHOT.jar" --title="ServerTime"
sleep 10
gnome-terminal -e "java -jar PeriodoServer/target/PeriodoServer-0.1-SNAPSHOT.jar" --title="Periodo"
sleep 10
gnome-terminal -e "java -jar EntradaServer/target/EntradaServer-0.1-SNAPSHOT.jar" --title="Entrada"





