import { render, screen } from '@testing-library/react';
import App from './App';

test('renders Dad Jokes title', () => {
  render(<App />);
  const linkElement = screen.getByText(/Dad Jokes/i);
  expect(linkElement).toBeInTheDocument();
});
