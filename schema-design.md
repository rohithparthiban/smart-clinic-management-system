# Smart Clinic Database Schema

## Doctor
doctor_id INT PRIMARY KEY
name VARCHAR(100)
speciality VARCHAR(100)

## Patient
patient_id INT PRIMARY KEY
name VARCHAR(100)
email VARCHAR(100)

## Appointment
appointment_id INT PRIMARY KEY
doctor_id INT
patient_id INT
appointment_time DATETIME

## Prescription
prescription_id INT PRIMARY KEY
appointment_id INT
notes TEXT
