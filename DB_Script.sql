-- Drop table Benutzer if exists (Apache Derby doesn't support IF EXISTS directly)
-- Make sure to drop the table manually or use your DB management tool to drop it before running this script

-- Create Benutzer table
CREATE TABLE Benutzer
(
    id             INT PRIMARY KEY GENERATED ALWAYS AS IDENTITY (START WITH 1, INCREMENT BY 1),
    name           VARCHAR(255),
    vorname        VARCHAR(255),
    strasse        VARCHAR(255),
    stadt          VARCHAR(255),
    plz            VARCHAR(20),
    land           VARCHAR(255),
    benutzergruppe VARCHAR(50),
    email          VARCHAR(255),
    passwort       VARCHAR(255)
);

-- Insert example data
INSERT INTO Benutzer (name, vorname, strasse, stadt, plz, land, benutzergruppe, email, passwort)
VALUES ('Mustermann', 'Max', 'Musterstraße 1', 'Musterstadt', '12345', 'Musterland', 'ADMIN',
        'max.mustermann@example.com', 'password123'),

       ('Doe', 'John', 'Main St 123', 'Sample City', '67890', 'Sample Country', 'USER', 'john.doe@example.com',
        'password456');

-- Drop table Helfer if exists (Apache Derby doesn't support IF EXISTS directly)
-- Make sure to drop the table manually or use your DB management tool to drop it before running this script

-- Create the table
CREATE TABLE Helfer
(
    id         INT NOT NULL GENERATED ALWAYS AS IDENTITY (START WITH 1, INCREMENT BY 1),
    mitgliedId INT NOT NULL,
    eventId    INT NOT NULL,
    PRIMARY KEY (id)
);

-- Optionally, you can add indexes for the foreign keys if necessary
CREATE INDEX idx_mitgliedId ON Helfer (mitgliedId);
CREATE INDEX idx_eventId ON Helfer (eventId);

-- Insert sample data
-- INSERT INTO Helfer (mitgliedId, eventId) VALUES (1, 100);
-- INSERT INTO Helfer (mitgliedId, eventId) VALUES (2, 101);