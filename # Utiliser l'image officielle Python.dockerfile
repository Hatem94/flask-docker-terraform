# Utiliser l'image officielle Python
FROM python:3.9-slim

# Définir le répertoire de travail
WORKDIR /app

# Copier les fichiers nécessaires
COPY app.py /app

# Installer Flask
RUN pip install flask

# Exposer le port 5000
EXPOSE 5000

# Démarrer l'application Flask
CMD ["python", "app.py"]
