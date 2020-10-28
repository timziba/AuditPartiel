-- phpMyAdmin SQL Dump
-- version 5.0.2
-- https://www.phpmyadmin.net/
--
-- Hôte : 127.0.0.1
-- Généré le : mer. 28 oct. 2020 à 15:04
-- Version du serveur :  10.4.14-MariaDB
-- Version de PHP : 7.2.33

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de données : `demojpa`
--

-- --------------------------------------------------------

--
-- Structure de la table `course`
--

CREATE TABLE `course` (
  `id` int(11) NOT NULL,
  `numberHours` int(11) NOT NULL,
  `themeCourse` varchar(255) DEFAULT NULL
) ENGINE=MyISAM DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Structure de la table `hibernate_sequence`
--

CREATE TABLE `hibernate_sequence` (
  `next_val` bigint(20) DEFAULT NULL
) ENGINE=MyISAM DEFAULT CHARSET=utf8mb4;

--
-- Déchargement des données de la table `hibernate_sequence`
--

INSERT INTO `hibernate_sequence` (`next_val`) VALUES
(1);

-- --------------------------------------------------------

--
-- Structure de la table `person`
--

CREATE TABLE `person` (
  `type_personne` varchar(31) NOT NULL,
  `id` bigint(20) NOT NULL,
  `adress` varchar(255) DEFAULT NULL,
  `firstName` varchar(255) DEFAULT NULL,
  `lastName` varchar(255) DEFAULT NULL,
  `mailAdresse` varchar(255) DEFAULT NULL,
  `numberPhone` varchar(255) DEFAULT NULL,
  `dateOfBirth` varchar(255) DEFAULT NULL,
  `login` varchar(255) DEFAULT NULL,
  `password` varchar(255) DEFAULT NULL,
  `profil` varchar(255) DEFAULT NULL,
  `course_id` int(11) DEFAULT NULL
) ENGINE=MyISAM DEFAULT CHARSET=utf8mb4;

--
-- Déchargement des données de la table `person`
--

INSERT INTO `person` (`type_personne`, `id`, `adress`, `firstName`, `lastName`, `mailAdresse`, `numberPhone`, `dateOfBirth`, `login`, `password`, `profil`, `course_id`) VALUES
('student', 3, '26 avenue robert surcouf', 'Fatimata', 'Ba', '26 avenue robert surcouf', '0767468688', '2020-10-22', NULL, NULL, NULL, NULL),
('user', 7, NULL, NULL, NULL, NULL, NULL, NULL, 'tima', 'tima', 'R', NULL),
('user', 6, NULL, 'yoeko', 'klu', NULL, NULL, NULL, 'admin', 'admin', 'D', NULL);

--
-- Index pour les tables déchargées
--

--
-- Index pour la table `course`
--
ALTER TABLE `course`
  ADD PRIMARY KEY (`id`);

--
-- Index pour la table `person`
--
ALTER TABLE `person`
  ADD PRIMARY KEY (`id`),
  ADD KEY `FK5f6hmjsouvq59534b95p9mmj7` (`course_id`);

--
-- AUTO_INCREMENT pour les tables déchargées
--

--
-- AUTO_INCREMENT pour la table `person`
--
ALTER TABLE `person`
  MODIFY `id` bigint(20) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=9;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
