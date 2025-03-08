# Utiliser une image de base officielle
FROM python:3.9-slim

# Installer Flask
RUN pip install flask

# Copier les fichiers de l'application
COPY app.py /app.py

# Exposer le port Flask
EXPOSE 5000

# Lancer l'application Flask
CMD ["python", "app.py"]
