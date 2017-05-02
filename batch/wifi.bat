@echo off
md wifis
cd wifis
netsh wlan export profile
echo -------------------------------------
echo   perfiles exportados correctamente
echo -------------------------------------
pause > nul
