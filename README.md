# 📁 Manejo de Archivos en Java – Guía APE

<div align="center">

### Ejercicios 1-3 | Programación en Java

![Java](https://img.shields.io/badge/Java-ED8B00?style=for-the-badge&logo=openjdk&logoColor=white)
![File Handling](https://img.shields.io/badge/File_Handling-2C3E50?style=for-the-badge)
![Status](https://img.shields.io/badge/Estado-Desarrollo-success?style=for-the-badge)

**Lectura • Escritura • Procesamiento • Validación de archivos**

</div>

---

## 📖 Descripción del proyecto

Este repositorio contiene el desarrollo de diez ejercicios prácticos de la segunda parte de la Guía APE de Java, enfocados en el manejo de archivos de texto.

Mediante diferentes situaciones y problemas prácticos, se aplican herramientas de Java para crear, escribir, leer, modificar y procesar información almacenada en archivos `.txt`.

Los ejercicios permiten fortalecer los conocimientos sobre el manejo de ficheros, el procesamiento de datos, la utilización de excepciones y la implementación de operaciones de entrada y salida.

## 🎯 Objetivo general

Desarrollar programas en Java que permitan gestionar información mediante archivos de texto, aplicando clases como `File`, `FileWriter`, `BufferedWriter`, `FileReader` y `BufferedReader`, junto con estructuras de control y validaciones.

## 🧠 Contenidos y tecnologías

| Herramienta | Aplicación |
|---|---|
| `File` | Comprobar y gestionar archivos |
| `FileWriter` | Escribir información |
| `BufferedWriter` | Escribir y agregar registros |
| `FileReader` | Leer archivos carácter por carácter |
| `BufferedReader` | Leer información línea por línea |
| `read()` | Leer caracteres |
| `readLine()` | Leer líneas de texto |
| `IOException` | Controlar errores de entrada y salida |
| `try-catch` | Gestionar excepciones |
| `append` | Agregar información sin sobrescribir |

## 📚 Desarrollo de los ejercicios

### 🔎 Ejercicio 1. Agencia de detectives: análisis de pistas

**Archivo:** `pistas.txt`

Desarrollar un programa que lea todas las pistas almacenadas en un archivo de texto, muestre cada registro línea por línea y contabilice el número total de pistas.

**Conceptos aplicados:**
- Lectura con `BufferedReader`.
- Método `readLine()`.
- Contador de registros.
- Recorrido de archivos.

### 🚀 Ejercicio 2. Estación espacial: descifrado de mensajes

**Archivo:** `mensaje.txt`

Desarrollar un programa que lea un mensaje de emergencia carácter por carácter utilizando `FileReader` y el método `read()`. Mostrar el contenido y contabilizar el número total de caracteres.

**Conceptos aplicados:**
- Clase `FileReader`.
- Lectura carácter por carácter.
- Método `read()`.
- Contador de caracteres.

### 🏛️ Ejercicio 3. Museo: clasificación de obras de arte

**Archivo:** `obras.txt`

Desarrollar un programa que lea los registros de las obras de arte, mostrando sus nombres y categorías. Además, clasificar y contabilizar cuántas obras pertenecen a cada categoría.

**Conceptos aplicados:**
- Lectura línea por línea.
- Separación de registros.
- Clasificación de información.
- Contadores por categoría.
  
---

## 📂 Estructura del repositorio

```text
Manejo-Archivos-Java/
│
├── Ejercicio01/
│   ├── pistas.txt
│   └── Main.java
│
├── Ejercicio02/
│   ├── mensaje.txt
│   └── Main.java
│
├── Ejercicio03/
│   ├── obras.txt
│   └── Main.java
│
└── README.md
```


## ⚙️ Requisitos para ejecutar los programas

- Java JDK instalado.
- Visual Studio Code, IntelliJ IDEA o Eclipse.
- Extensión de Java para Visual Studio Code (si se utiliza este editor).
- Archivos de texto correspondientes a cada ejercicio.

## ▶️ Ejecución

1. Clonar el repositorio:

```bash
git clone URL_DEL_REPOSITORIO
```

2. Abrir el proyecto en el entorno de desarrollo.

3. Seleccionar la carpeta del ejercicio que se desea ejecutar.

4. Verificar que el archivo `.txt` correspondiente esté disponible.

5. Ejecutar la clase principal `Main.java`.

6. Comprobar los resultados en la consola y los cambios realizados en los archivos de texto.

## 📌 Aprendizajes obtenidos

A través de estos ejercicios se busca desarrollar habilidades para:

- Crear y administrar archivos de texto desde Java.
- Escribir y agregar información sin perder registros anteriores.
- Leer archivos carácter por carácter y línea por línea.
- Buscar, clasificar y filtrar información.
- Procesar datos numéricos almacenados como texto.
- Realizar cálculos y estadísticas con registros.
- Validar información y controlar excepciones.

## 👨‍💻 Autor

**Jeremy Toalombo**

Estudiante de Ingeniería en Software  
Universidad Técnica de Ambato (UTA)

---

<div align="center">

### ☕ JAVA | MANEJO DE ARCHIVOS

**Aprender • Practicar • Programar**

*Segunda parte de la Guía APE de Java*

</div>
