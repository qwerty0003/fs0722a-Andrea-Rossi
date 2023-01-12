export interface User {
  id: number;
  name: string;
  role: 'user' | 'admin';
  email: string;
}
