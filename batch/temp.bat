@echo off
rd /s /q %Temp%
md %Temp%
echo -----------------------------------
echo   archivos temporales eliminados
echo -----------------------------------
echo pulsa cualquier tecla para salir....
pause>nul