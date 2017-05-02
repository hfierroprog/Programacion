import pygame

def main():
    pygame.init()
    pygame.display.set_mode([640,480])
    pantalla = pygame.display.set_caption("Ventana basica")
    salir = False
    reloj1 = pygame.time.Clock()
    color = (255,255,255)

    while salir != True:
        for event in pygame.event.get():
            if event.type == pygame.QUIT:
                salir = True
        reloj1.tick(60)
        pantalla.fill(blanco)
        pygame.display.update()

        
    pygame.quit()


main()
