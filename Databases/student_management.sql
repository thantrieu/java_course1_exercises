USE [master]
GO

/****** Object:  Database [student_management]    Script Date: 11/1/2020 11:27:51 AM ******/
CREATE DATABASE [student_management]
 CONTAINMENT = NONE
 ON  PRIMARY 
( NAME = N'student_managerment', FILENAME = N'C:\Program Files\Microsoft SQL Server\MSSQL15.SQLEXPRESS\MSSQL\DATA\student_managerment.mdf' , SIZE = 8192KB , MAXSIZE = UNLIMITED, FILEGROWTH = 65536KB )
 LOG ON 
( NAME = N'student_managerment_log', FILENAME = N'C:\Program Files\Microsoft SQL Server\MSSQL15.SQLEXPRESS\MSSQL\DATA\student_managerment_log.ldf' , SIZE = 8192KB , MAXSIZE = 2048GB , FILEGROWTH = 65536KB )
 WITH CATALOG_COLLATION = DATABASE_DEFAULT
GO

IF (1 = FULLTEXTSERVICEPROPERTY('IsFullTextInstalled'))
begin
EXEC [student_management].[dbo].[sp_fulltext_database] @action = 'enable'
end
GO

ALTER DATABASE [student_management] SET ANSI_NULL_DEFAULT OFF 
GO

ALTER DATABASE [student_management] SET ANSI_NULLS OFF 
GO

ALTER DATABASE [student_management] SET ANSI_PADDING OFF 
GO

ALTER DATABASE [student_management] SET ANSI_WARNINGS OFF 
GO

ALTER DATABASE [student_management] SET ARITHABORT OFF 
GO

ALTER DATABASE [student_management] SET AUTO_CLOSE OFF 
GO

ALTER DATABASE [student_management] SET AUTO_SHRINK OFF 
GO

ALTER DATABASE [student_management] SET AUTO_UPDATE_STATISTICS ON 
GO

ALTER DATABASE [student_management] SET CURSOR_CLOSE_ON_COMMIT OFF 
GO

ALTER DATABASE [student_management] SET CURSOR_DEFAULT  GLOBAL 
GO

ALTER DATABASE [student_management] SET CONCAT_NULL_YIELDS_NULL OFF 
GO

ALTER DATABASE [student_management] SET NUMERIC_ROUNDABORT OFF 
GO

ALTER DATABASE [student_management] SET QUOTED_IDENTIFIER OFF 
GO

ALTER DATABASE [student_management] SET RECURSIVE_TRIGGERS OFF 
GO

ALTER DATABASE [student_management] SET  DISABLE_BROKER 
GO

ALTER DATABASE [student_management] SET AUTO_UPDATE_STATISTICS_ASYNC OFF 
GO

ALTER DATABASE [student_management] SET DATE_CORRELATION_OPTIMIZATION OFF 
GO

ALTER DATABASE [student_management] SET TRUSTWORTHY OFF 
GO

ALTER DATABASE [student_management] SET ALLOW_SNAPSHOT_ISOLATION OFF 
GO

ALTER DATABASE [student_management] SET PARAMETERIZATION SIMPLE 
GO

ALTER DATABASE [student_management] SET READ_COMMITTED_SNAPSHOT OFF 
GO

ALTER DATABASE [student_management] SET HONOR_BROKER_PRIORITY OFF 
GO

ALTER DATABASE [student_management] SET RECOVERY SIMPLE 
GO

ALTER DATABASE [student_management] SET  MULTI_USER 
GO

ALTER DATABASE [student_management] SET PAGE_VERIFY CHECKSUM  
GO

ALTER DATABASE [student_management] SET DB_CHAINING OFF 
GO

ALTER DATABASE [student_management] SET FILESTREAM( NON_TRANSACTED_ACCESS = OFF ) 
GO

ALTER DATABASE [student_management] SET TARGET_RECOVERY_TIME = 60 SECONDS 
GO

ALTER DATABASE [student_management] SET DELAYED_DURABILITY = DISABLED 
GO

ALTER DATABASE [student_management] SET ACCELERATED_DATABASE_RECOVERY = OFF  
GO

ALTER DATABASE [student_management] SET QUERY_STORE = OFF
GO

ALTER DATABASE [student_management] SET  READ_WRITE 
GO

