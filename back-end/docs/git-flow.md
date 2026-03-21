# Git-flow

### 1. Start from main

```
git checkout main
git pull
```

### 2. Create a branch

```
git checkout -b <type>/<short-name>
```

### 3. Work and commit

```
git add .
git commit -m "type: short description"
```

Types:

```
feature — new functionality
docs — documentation changes
refactor — code restructuring without behavior change
test — tests added or modified
chore — maintenance (config, build, dependencies)
```

### 4. Push branch

```
git push -u origin <branch-name>
```

### 5. Create Pull Request

Open PR on GitHub
base: `main`
compare: your branch

Link issue if needed:

```
Closes #<issue-number>
```

### 6. Merge

Merge the PR into `main`.

### 7. Cleanup

After merge:

```
git checkout main
git pull
git branch -d <branch-name>
```
