def tipodefigurita(lista):
  
  #unicos = list(set(lista))
  
  unicos =[]
  for i in lista:
    if i not in unicos:
      unicos.append(i)
  return unicos

def mefaltandeltipodefigurita(lista_posiciones, lista_elementos, elemento_muestra):
  
  #lista_encontrados = [int(i) for i in lista_posiciones if lista_elementos[int(i)] == elemento_muestra]
  
  lista_encontrados = []
  for i in lista_posiciones:
    if lista_elementos[int(i)] == elemento_muestra:
      lista_encontrados.append(int(i))
  return lista_encontrados

def notengo(lista_otra_persona, lista_mia):
  
  #lista_me_interesa = [int(i) for i in lista_otra_persona if i not in lista_mia]
  
  lista_me_interesa = []
  for i in lista_otra_persona:
    if i not in lista_mia:
      lista_me_interesa.append(int(i))
  return lista_me_interesa

def puedocambiar(lista1, lista2):
  
  #elementos_lista1_no_en_lista2 = [i for i in lista1 if i not in lista2]
  #elementos_lista2_no_en_lista1 = [i for i in lista2 if i not in lista1]
  
  elementos_lista1_no_en_lista2 = []
  elementos_lista2_no_en_lista1 = []

  for i in lista1:
    if i not in lista2:
      elementos_lista1_no_en_lista2.append(i)

  for i in lista2:
    if i not in lista1:
      elementos_lista2_no_en_lista1.append(i)

  #if len(elementos_lista2_no_en_lista1)>= len(elementos_lista1_no_en_lista2):
    #return len(elementos_lista1_no_en_lista2)
  #else:
    #return elementos_lista2_no_en_lista1
      
  return min(len(elementos_lista2_no_en_lista1), len(elementos_lista1_no_en_lista2))