:main
@echo off
set /p archivo="Ingresa nombre de archivo: "
netsh wlan add profile filename=%archivo%
set /p continuar="Perfil agregado correctamente agregar otro? (Y/N): "
if %continuar% == "y" or "Y" goto main
else pause