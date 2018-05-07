---
title: ALDT parser
layout: page
---

User documentation to be developed here.


[API documentation](https://neelsmith.github.io/aldtparser/api/edu/holycross/shot/aldt/index.html).


## Overview

A treebank is a syntactic analysis of sentence. It overlays a syntactic graph on  the linear sequence of a tokens in a text.

In this package:

-   A `Treebank` is a sequence of `Sentence`s.
-   A `Sentence` is a linear sequence of `SyntaxToken`s.
-   Each `SyntaxToken` is also positioned in a syntax tree by its relation to another token (the "head" token) in a specified relation.
