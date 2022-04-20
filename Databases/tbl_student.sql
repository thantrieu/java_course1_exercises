USE [LearnCSharp]
GO

/****** Object:  Table [dbo].[Person]    Script Date: 04/18/2022 14:46:06 ******/
SET ANSI_NULLS ON
GO

SET QUOTED_IDENTIFIER ON
GO

CREATE TABLE [dbo].[Person](
	[Id] [int] IDENTITY(100,1) NOT NULL,
	[FirstName] [nvarchar](50) NULL,
	[LastName] [nvarchar](50) NULL,
	[MidName] [nvarchar](50) NULL,
	[Age] [int] NULL,
	[Address] [nvarchar](50) NULL,
	[Email] [nvarchar](40) NULL,
	[Salary] [float] NOT NULL,
PRIMARY KEY CLUSTERED 
(
	[Id] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY]
GO

ALTER TABLE [dbo].[Person] ADD  DEFAULT ((0)) FOR [Age]
GO

ALTER TABLE [dbo].[Person] ADD  DEFAULT ((0)) FOR [Salary]
GO

